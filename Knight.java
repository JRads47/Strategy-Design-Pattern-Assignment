
public class Knight extends Character
{
	public Knight(String name)
	{
		super(name);
	}
	public void display()
	{
		System.out.println(name+" is a valiant knight");
	}
	public void attack()
	{
		weaponBehavior=new WeaponBow();
		weaponBehavior.attack();
	}
}
