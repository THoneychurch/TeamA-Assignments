package starwars.entities;

import edu.monash.fit2099.simulator.userInterface.MessageRenderer;
import starwars.Capability;
import starwars.SWEntity;
import starwars.actions.Take;

public class TuskenGaffiStick extends SWEntity {

	/* Matt - new class, 06/05/17
	 * modified from lightsaber
	 * all Tuskens should hold this when made
	 * double damage of tusken hand-to-hand combat (10)
	 */
	
	public TuskenGaffiStick(MessageRenderer m) {
		super(m);
		
		this.shortDescription = "A crude Tusken melee weapon.";
		this.longDescription = "A crude Tusken melee weapon, comes standard with every Tusken.";
		this.hitpoints = 20; // low damage for crude weapon
		
		this.addAffordance(new Take(this, m));//add the take affordance so that the TuskenGaffiStick can be taken by SWActors
		this.capabilities.add(Capability.WEAPON);// it's a weapon.  
	}

	@Override
	public String getSymbol() {
		return "G";
	}		


}
