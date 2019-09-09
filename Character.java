/*Strategy Design Assignment by Jay-Rads Villanueva*/
public abstract class Character 
{ 
	protected String name;
	WeaponBehavior weaponBehavior; /*to be initialized later*/
	public Character(String x)/** x is for the character's name**/
	{
		this.name=x;
	}
	public abstract void display();
	public abstract void attack();
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		weaponBehavior=wb;
	}
}
