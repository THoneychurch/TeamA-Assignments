package starwars.entities.actors;

import java.util.List;

import edu.monash.fit2099.simulator.userInterface.MessageRenderer;
import starwars.SWActor;
import starwars.SWLegend;
import starwars.SWEntityInterface;
import starwars.SWLocation;
import starwars.SWWorld;
import starwars.Team;

public class AuntBeru extends SWLegend {

	public AuntBeru(MessageRenderer m, SWWorld world) {
		super(Team.GOOD, 25, m, world); 
		this.setShortDescription("Aunt Beru");
		this.setLongDescription("Like a mother to Luke, a kind and caring woman.");
	}
	
	public void act() {
		say(this.getShortDescription() + " is standing still at " + this.world.getEntityManager().whereIs(this).getShortDescription());
	}
}
