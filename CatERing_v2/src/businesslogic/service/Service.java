package businesslogic.service;

import businesslogic.kitchenJob.SummarySheet;

public class Service {

    private String name;
    private String type;
    private int duration;
    private String[] serviceNotes;

    public SummarySheet createSummary(){
        return new SummarySheet();
    }
}
