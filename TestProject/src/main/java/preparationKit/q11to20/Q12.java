package preparationKit.q11to20;

public class Q12 {
}

interface  Exportable{
    void export();
}

class Tools implements Exportable{

    public void export(){ // line1
        System.out.println("Toool::Export");
    }
}

class ReportTool extends Tools implements  Exportable{

    public void export(){
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tools aTool = new ReportTool();
        Tools bTool = new Tools();
        callExport(aTool);
        callExport(bTool);

    }

    public static void callExport(Exportable ex) {
        ex.export();
    }
}

