package Tools;

import Entities.Carte;
import Entities.Menu;
import Entities.Plat;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    // A compléter ici

    public void LoadDataCarte(ArrayList<Carte> LaCarte){
        columns = new String[]{"Numéro","Nom"};
        rows = new Object[LaCarte.size()][2];
        int i =0;
        for (Carte crt : LaCarte){
            rows[i][0] = crt.getIdCarte();
            rows[i][1] = crt.getNomCarte();
            i++;
        }
        fireTableChanged(null);

    }

    public void LoadDataMenu(ArrayList<Menu> desMenus){
        columns = new String[]{"Numéro","Nom"};
        rows = new Object[desMenus.size()][2];
        int i =0;
        for (Menu mnu : desMenus){
            rows[i][0] = mnu.getIdMenu();
            rows[i][1] = mnu.getNomMenu();
            i++;
        }
        fireTableChanged(null);
    }

    public  void LoadDataPlat(ArrayList<Plat> desPlats){
        columns = new String[]{"Numéro","Nom","Note"};
        rows = new Object[desPlats.size()][3];
        int i =0;
        for (Plat plt : desPlats){
            rows[i][0] = plt.getIdPlat();
            rows[i][1] = plt.getNomPlat();
            rows[i][2] = plt.getNotePlat();
            i++;
        }
        fireTableChanged(null);


    }





}
