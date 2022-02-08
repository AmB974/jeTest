package interfaces;

import robot.Programme;
import terrain.Terrain;

import javax.swing.*;
import java.awt.*;

public interface Detachable {
    Programme getProgramme();

    Terrain getTerrain();

    void setTerrain(Terrain var1);

    JSplitPane getSplitPane();

    void redessine();

    Robot getRobot();

    void setRobot(Robot var1);

    Dimension getSize();

    JTree getArbre();

    void montreDialInit();

    JMenuBar getJMenuBar();

    BoiteDeDialogueInit getDialogueInitialisation();

    void viderTerrain();

    PanneauTerrain getPanneauTerrain();

    void setPanneauTerrain(PanneauTerrain var1);

    PanneauCommande getPanneauCommande();

    void setPanneauCommande(PanneauCommande var1);

    void executeProgramme();

    void executeSelection();

    void setTitle(String var1);
}
