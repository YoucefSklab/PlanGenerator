package agentsContainers;
import org.graphstream.graph.Graph;
import java.io.FileNotFoundException;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import Plan.PlanManagment;
import Plan.planSet;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
public class containerAgent594 {
	public static void main(String[] args )throws FileNotFoundException {
	planSet pSet = new planSet();
	Graph PlanA = pSet.getPlanByNbr(594);
		try {
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false);
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
			AgentController agentController=agentContainer.createNewAgent("Agent594",
			"Agents.Agent1", new Object[]{PlanA, "Agent594"});
			agentController.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
