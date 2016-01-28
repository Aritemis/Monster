package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{

	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a monster. His name is " + baseController.getMyMonster().getName() + ".");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has " + baseController.getMyMonster().getArmCount() + " arms.");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " also has " + baseController.getMyMonster().getHowMuchHair() + " antennae.");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " only has " + baseController.getMyMonster().getEyeCount() + " eye.");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + "'s hobbies include standing there looking cute,...");
		JOptionPane.showMessageDialog(null, "eating ice cream,...");
		JOptionPane.showMessageDialog(null, "and relishing in the tortured screams of the innocent.");
		JOptionPane.showMessageDialog(null, "He will use his unthreatening appearance to get close to you before devouring your soul.");
		JOptionPane.showMessageDialog(null, "Isn't that nice?");
		JOptionPane.showMessageDialog(null, "I thought so.");
	}
	
}
