import javax.naming.Name;
import java.util.Stack;

public class Station {

    private Stack<Nameable> Station = new Stack<Nameable>();

    public void rijdtBinnen(Trein trein) {
        leegTrein(trein);
        volTrein(trein);

    }

    private void leegTrein(Trein trein) {


        for (String name : trein.getNames()) {
            Nameable uitgestapte = trein.uitstappen(name);
            station.push(uitgestapte);
        }
    }

    private void volTrein(Trein trein) {
        while (!Station.isEmpty()) {
            Nameable opgestapelde = Station.pop();
            trein.instappen(opgestapelde);
        }
    }
}
