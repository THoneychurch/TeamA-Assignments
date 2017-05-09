package starwars.entities.actors;

import java.util.List;

import edu.monash.fit2099.simulator.userInterface.MessageRenderer;
import starwars.SWActor;
import starwars.SWLegend;
import starwars.SWEntityInterface;
import starwars.SWLocation;
import starwars.SWWorld;
import starwars.Team;

public class UncleOwen extends SWLegend {

	public UncleOwen(MessageRenderer m, SWWorld world) {
		super(Team.GOOD, 25, m, world); 
		this.setShortDescription("Uncle Owen");
		this.setLongDescription("Might not be alive for much longer, but looks satisfied.");
	}
	
	public void legendAct() {
		say(this.getShortDescription() + " is standing still at " + this.world.getEntityManager().whereIs(this).getShortDescription());
	}
}
