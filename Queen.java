
public class Queen extends Character
{
	public Queen(String name)
	{
		super(name);
	}
	public void display()
	{
		System.out.println(name+" is a beautiful queen");
	}
	public void attack()
	{
		weaponBehavior=new WeaponKnife();
		weaponBehavior.attack();
	}
}
