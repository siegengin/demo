package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CharacterCreatorGUI {

    private JFrame frame;
    private JTextField nameField;
    private ButtonGroup genderGroup, sizeGroup, raceGroup, roleGroup;
    private JPanel racePanel, rolePanel;

    public CharacterCreatorGUI() {
        initUI();
    }

    private void initUI() {
        frame = new JFrame("D&D Character Creator");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Character name
        frame.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        frame.add(nameField);

        // Gender Options
        frame.add(new JLabel("Gender:"));
        genderGroup = new ButtonGroup();
        createRadioButton("1", genderGroup, frame);
        createRadioButton("2", genderGroup, frame);
        createRadioButton("3", genderGroup, frame);

        // Size Options
        frame.add(new JLabel("Size:"));
        sizeGroup = new ButtonGroup();
        createRadioButton("small", sizeGroup, frame).addItemListener(new UpdateRaceOptions());
        createRadioButton("medium", sizeGroup, frame).addItemListener(new UpdateRaceOptions());
        createRadioButton("large", sizeGroup, frame).addItemListener(new UpdateRaceOptions());

        // Race Options (dynamically populated based on size)
        racePanel = new JPanel();
        frame.add(racePanel);

        // Role Options (dynamically populated based on race)
        rolePanel = new JPanel();
        frame.add(rolePanel);

        frame.setVisible(true);
    }

    private JRadioButton createRadioButton(String text, ButtonGroup group, Container container) {
        JRadioButton button = new JRadioButton(text);
        group.add(button);
        container.add(button);
        return button;
    }

    class UpdateRaceOptions implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            // ... (as per previous answer)
        }
    }

    class UpdateRoleOptions implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            // ... (as per previous answer)
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CharacterCreatorGUI());
    }
}

