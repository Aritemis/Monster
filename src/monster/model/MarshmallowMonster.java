package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double numberOfLegs;
	private double howMuchHair;
	private int armCount;
	private int eyeCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		//bad
	}
	
	public MarshmallowMonster(String name, int eyeCount)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		//slightly better
	}
	
	public MarshmallowMonster(String name, double numberOfLegs, double howMuchHair, 
	int armCount, int eyeCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.howMuchHair = howMuchHair;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		//great
		
	}

// Getters are public. Name == getThing. Same type as thing.	
	
	public String getName()
	{
		return name;
	}
	
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public double getHowMuchHair()
	{
		return howMuchHair;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
	
	
}

