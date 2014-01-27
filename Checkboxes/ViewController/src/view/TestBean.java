package view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import javax.faces.model.SelectItem;

import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;

public class TestBean {
    private RichPanelGroupLayout panel;
    private List<SelectItem> organisations;

    public TestBean() {
    }

    public void setPanel(RichPanelGroupLayout panel) {
        this.panel = panel;
    }

    public RichPanelGroupLayout getPanel() {
        return panel;
    }
   

    public void valueChange(ValueChangeEvent valueChangeEvent) {
        System.out.println("Value Change"+ valueChangeEvent.getNewValue());
    }

    public void setOrganisations(List<SelectItem> organisations) {
        this.organisations = organisations;
    }

    public List<SelectItem> getOrganisations() {
        
        organisations = new ArrayList<SelectItem>();
        for (int i=0; i< 5; i++){
        SelectItem s = new SelectItem();
        s.setLabel("Test" + i);
        s.setValue("Test" + i);
            organisations.add(s);
        }
        
        return organisations;
    }

    public void booleanCheckBoxListener(ValueChangeEvent valueChangeEvent) {
       System.out.println("New Value" + valueChangeEvent.getNewValue());
    }
}
