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
public class containerAgent465 {
	public static void main(String[] args )throws FileNotFoundException {
	planSet pSet = new planSet();
	Graph PlanA = pSet.getPlanByNbr(465);
		try {
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false);
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
			AgentController agentController=agentContainer.createNewAgent("Agent465",
			"Agents.Agent1", new Object[]{PlanA, "Agent465"});
			agentController.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
