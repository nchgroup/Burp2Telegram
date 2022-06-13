package burp;


import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class ConfigComponent {
    private JPanel panel1;
    public JTextField telegramTokentxtbox;
    public JTextField msgformattxtbox;
    private JButton notificationstartbtn;
    public JTextField responsebodycontainstxtbox;
    public JTextField responseheaderscontaintxtbox;
    public JTextField responsetimetxtbox;
    public JTextField httpstatuscodetxtbox;
    private JButton clearButton;
    public JTextField contentlengthtxtbox;
    public JTextField pollseconds;
    private JButton notificationstopbtn;
    public JTextField chatIDtxtbox;
    public JCheckBox onlyInScopeCheckBox;
    public JCheckBox scannerCheckBox;
    public JCheckBox targetCheckBox;
    public JCheckBox repeaterCheckBox;
    public JCheckBox proxyCheckBox;
    public JCheckBox intruderCheckBox;
    public JCheckBox spiderCheckBox;
    public JCheckBox extenderCheckBox;
    private JButton selectAllButton;
    private JButton clearButton1;
    private JLabel title;

    public static String checktest = "hello";
    public IBurpExtenderCallbacks callbacks;

    public void saveKeys(){
        String token = BurpExtenderTab.configcomp.telegramTokentxtbox.getText().toString();
        String chat = BurpExtenderTab.configcomp.chatIDtxtbox.getText().toString();
        callbacks.saveExtensionSetting("token_bot_telegram",token);
        callbacks.saveExtensionSetting("chat_id_telegram",chat);

        String notification_message = BurpExtenderTab.configcomp.msgformattxtbox.getText();
        callbacks.saveExtensionSetting("notification_message_telegram",notification_message);

    }

    public ConfigComponent(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;


        notificationstartbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checktest = "hamidovovo";
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                responsebodycontainstxtbox.setText("");
                responseheaderscontaintxtbox.setText("");
                httpstatuscodetxtbox.setText("");
                contentlengthtxtbox.setText("");
                responsetimetxtbox.setText("");
            }
        });

        notificationstartbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveKeys();

                notificationstopbtn.setEnabled(true);
                notificationstartbtn.setEnabled(false);

                onlyInScopeCheckBox.setEnabled(false);
                targetCheckBox.setEnabled(false);
                proxyCheckBox.setEnabled(false);
                spiderCheckBox.setEnabled(false);
                scannerCheckBox.setEnabled(false);
                repeaterCheckBox.setEnabled(false);
                intruderCheckBox.setEnabled(false);
                extenderCheckBox.setEnabled(false);

                VariableManager.setisStart(true);
                VariableManager.setstopTimer(false);
            }
        });
        notificationstopbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notificationstartbtn.setEnabled(true);
                notificationstopbtn.setEnabled(false);

                onlyInScopeCheckBox.setEnabled(true);
                targetCheckBox.setEnabled(true);
                proxyCheckBox.setEnabled(true);
                spiderCheckBox.setEnabled(true);
                scannerCheckBox.setEnabled(true);
                repeaterCheckBox.setEnabled(true);
                intruderCheckBox.setEnabled(true);
                extenderCheckBox.setEnabled(true);

                VariableManager.setisStart(false);
                VariableManager.setstopTimer(true);
            }
        });

        selectAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (onlyInScopeCheckBox.isEnabled()) {
                    onlyInScopeCheckBox.setSelected(true);
                }
                if (targetCheckBox.isEnabled()){
                    targetCheckBox.setSelected(true);
                }
                if (proxyCheckBox.isEnabled()){
                    proxyCheckBox.setSelected(true);
                }
                if (spiderCheckBox.isEnabled()){
                    spiderCheckBox.setSelected(true);
                }
                if (scannerCheckBox.isEnabled()){
                    scannerCheckBox.setSelected(true);
                }
                if (repeaterCheckBox.isEnabled()){
                    repeaterCheckBox.setSelected(true);
                }
                if (intruderCheckBox.isEnabled()){
                    intruderCheckBox.setSelected(true);
                }
                if (extenderCheckBox.isEnabled()){
                    extenderCheckBox.setSelected(true);
                }

            }
        });
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (onlyInScopeCheckBox.isEnabled()) {
                    onlyInScopeCheckBox.setSelected(false);
                }
                if (targetCheckBox.isEnabled()){
                    targetCheckBox.setSelected(false);
                }
                if (proxyCheckBox.isEnabled()){
                    proxyCheckBox.setSelected(false);
                }
                if (spiderCheckBox.isEnabled()){
                    spiderCheckBox.setSelected(false);
                }
                if (scannerCheckBox.isEnabled()){
                    scannerCheckBox.setSelected(false);
                }
                if (repeaterCheckBox.isEnabled()){
                    repeaterCheckBox.setSelected(false);
                }
                if (intruderCheckBox.isEnabled()){
                    intruderCheckBox.setSelected(false);
                }
                if (extenderCheckBox.isEnabled()){
                    extenderCheckBox.setSelected(false);
                }
            }
        });


    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(20, 3, new Insets(5, 0, 0, 5), -1, -1));
        Font panel1Font = this.$$$getFont$$$("Arial", Font.PLAIN, 14, panel1.getFont());
        if (panel1Font != null) panel1.setFont(panel1Font);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$("Arial", Font.BOLD, 18, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-39373));
        label1.setText("Burp to Telegram Extension Settings");
        panel1.add(label1, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(18, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$("Arial", Font.PLAIN, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setText("These settings let you control the Telegram bot notifications that come from multiple Burp callbacks.");
        panel1.add(label2, new GridConstraints(1, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(5, 2, new Insets(5, 5, 5, 5), -1, -1));
        panel2.setForeground(new Color(-6710124));
        panel1.add(panel2, new GridConstraints(2, 0, 5, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 2, false));
        panel2.setBorder(BorderFactory.createTitledBorder(null, "Bot Settings", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$("Arial", Font.BOLD, 14, panel2.getFont()), new Color(-39373)));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, -1, -1, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("Bot Token");
        panel2.add(label3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Notification Message:");
        panel2.add(label4, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Chat ID");
        panel2.add(label5, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Poll every X seconds:");
        panel2.add(label6, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pollseconds = new JTextField();
        pollseconds.setText("60");
        panel2.add(pollseconds, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        telegramTokentxtbox = new JTextField();
        telegramTokentxtbox.setText("");
        panel2.add(telegramTokentxtbox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        msgformattxtbox = new JTextField();
        msgformattxtbox.setText("*[Burp]* Matched the condition: *{{FOUND}}* in Response: `{{BODY}}`");
        panel2.add(msgformattxtbox, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel2.add(panel3, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        notificationstopbtn = new JButton();
        notificationstopbtn.setEnabled(false);
        notificationstopbtn.setText("Stop");
        panel3.add(notificationstopbtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        notificationstartbtn = new JButton();
        notificationstartbtn.setText("Start");
        panel3.add(notificationstartbtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        chatIDtxtbox = new JTextField();
        chatIDtxtbox.setText("");
        panel2.add(chatIDtxtbox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$("Arial", Font.PLAIN, 14, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setText("Push a notification based on any of the following conditions:");
        panel1.add(label7, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 2, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(5, 3, new Insets(5, 5, 5, 5), -1, -1));
        panel4.setForeground(new Color(-6710124));
        panel1.add(panel4, new GridConstraints(9, 0, 8, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 2, false));
        panel4.setBorder(BorderFactory.createTitledBorder(null, "Telegram Notification Conditions", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$("Arial", Font.BOLD, 14, panel4.getFont()), new Color(-39373)));
        final JLabel label8 = new JLabel();
        label8.setText("Response Body Contains:");
        panel4.add(label8, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        responsebodycontainstxtbox = new JTextField();
        panel4.add(responsebodycontainstxtbox, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Response Headers Contain:");
        panel4.add(label9, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        responseheaderscontaintxtbox = new JTextField();
        panel4.add(responseheaderscontaintxtbox, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("Content Length:");
        panel4.add(label10, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("HTTP Status Code:");
        panel4.add(label11, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        httpstatuscodetxtbox = new JTextField();
        panel4.add(httpstatuscodetxtbox, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear");
        panel4.add(clearButton, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel4.add(panel5, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        contentlengthtxtbox = new JTextField();
        contentlengthtxtbox.setText("");
        panel4.add(contentlengthtxtbox, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel6.setEnabled(true);
        panel1.add(panel6, new GridConstraints(2, 2, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel6.setBorder(BorderFactory.createTitledBorder(null, "Filters", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$("Arial", Font.BOLD, 14, panel6.getFont()), new Color(-39373)));
        onlyInScopeCheckBox = new JCheckBox();
        onlyInScopeCheckBox.setText("Only in-scope");
        panel6.add(onlyInScopeCheckBox, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scannerCheckBox = new JCheckBox();
        scannerCheckBox.setText("Scanner");
        panel6.add(scannerCheckBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetCheckBox = new JCheckBox();
        targetCheckBox.setText("Target");
        panel6.add(targetCheckBox, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        repeaterCheckBox = new JCheckBox();
        repeaterCheckBox.setText("Repeater");
        panel6.add(repeaterCheckBox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        proxyCheckBox = new JCheckBox();
        proxyCheckBox.setText("Proxy");
        panel6.add(proxyCheckBox, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        intruderCheckBox = new JCheckBox();
        intruderCheckBox.setText("Intruder");
        panel6.add(intruderCheckBox, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        spiderCheckBox = new JCheckBox();
        spiderCheckBox.setText("Spider");
        panel6.add(spiderCheckBox, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        extenderCheckBox = new JCheckBox();
        extenderCheckBox.setText("Extender");
        panel6.add(extenderCheckBox, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectAllButton = new JButton();
        selectAllButton.setText("Select All");
        panel6.add(selectAllButton, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton1 = new JButton();
        clearButton1.setText("Clear");
        panel6.add(clearButton1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));



    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
