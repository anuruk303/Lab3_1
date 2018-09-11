import javax.swing.*;

public class Lab3_1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ใส่ตัว 1 ตัว","0");
        JOptionPane.showMessageDialog(null,input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,
                "รักหรือป่าว",
                "ถามเธอ",JOptionPane.YES_NO_CANCEL_OPTION);
        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุบๆ");

        }else{
            JOptionPane.showMessageDialog(null,"ใจร้ายจุง");
        }

    }
}
