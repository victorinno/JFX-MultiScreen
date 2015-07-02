/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License"). You
 * may not use this file except in compliance with the License. You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package screensframework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import screensframework.model.Participante;

/**
 * FXML Controller class
 *
 * @author Angie
 */
public class CarregarArquivoController implements Initializable, ControlledScreen {

    ScreensController myController;

    @FXML
    private TableView<Participante> participantesView = new TableView<>();

    @FXML
    private Label codFicha;
    @FXML
    private Label comeerj;
    @FXML
    private Label numeroFicha;
    @FXML
    private Label participacao;
    @FXML
    private Label comissao;
    @FXML
    private Label dataNascimento;
    @FXML
    private Label nomeCompleto;
    @FXML
    private Label cracha;
    @FXML
    private Label sexo;
    private ScreensFramework mainApp;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void carregarArquivo(ActionEvent event) {
        File file = new FileChooser().showOpenDialog(null);
        if (file != null) {
            /*try {
             Desktop.getDesktop().open(file);
             } catch (IOException ex) {
             Logger.getLogger(
             CarregarArquivoController.class.getName()).log(
             Level.SEVERE, null, ex
             );
             }*/

            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ";";

            try {

                br = new BufferedReader(new FileReader(file));
                br.readLine();
                while ((line = br.readLine()) != null) {

                    // use comma as separator
                    String[] dados = line.split(cvsSplitBy);

                    Participante p = new Participante(dados);
                    participantesView.getItems().add(p);
                    System.out.println(p);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }

    @FXML
    private void goToScreen3(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen3ID);
    }

    @FXML
    public TableView<Participante> getParticipantesView() {
        return participantesView;
    }

    public void setParticipantesView(TableView<Participante> participantesView) {
        this.participantesView = participantesView;
    }

    
    
}
