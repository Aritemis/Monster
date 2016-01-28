package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

// Controller owns things.
// It's in charge.


public class MonsterAppController
{

	
	private MarshmallowMonster myMonster;
	
	
	private MonsterView appView;
	
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Morf", 0, 2, 2, 1, 0, false);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	
}
