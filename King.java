
public class King extends Character
{
	public King(String name)
	{
		super(name);
	}
	public void display()
	{
		System.out.println(name+" is a noble king");
	}
	public void attack()
	{
		weaponBehavior=new WeaponSword();
		weaponBehavior.attack();
	}
}
