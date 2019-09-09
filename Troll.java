
public class Troll extends Character
{
	public Troll(String name)
	{
		super(name);
	}
	public void display()
	{
		System.out.println(name+" is a funny troll");
	}
	public void attack()
	{
		weaponBehavior=new WeaponAxe();
		weaponBehavior.attack();
	}
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		weaponBehavior=wb;
	}
}
