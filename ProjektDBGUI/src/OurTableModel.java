
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amaisu14
 */
public class OurTableModel extends DefaultTableModel{
    int columnDisabled=0;
    public OurTableModel(int columnDisabled){
        super();
        this.columnDisabled=columnDisabled;
    }
    @Override
    public boolean isCellEditable(int row,int column){
        if(column==columnDisabled && row!=getRowCount()-1) 
            return false;
        else 
            return true;
    }
}
