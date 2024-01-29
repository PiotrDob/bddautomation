package page.object.actions;

import page.object.pages.DevicesPage;
import utils.SessionObjects;


public class DevicesPageActions extends DevicesPage {

    public DevicesPageActions pickFirstElementFromList() {
        productCardsLst.get(0).click();
        return this;
    }

    public DevicesPageActions addToCartClick() {
        addToCartBtn.click();
        return this;
    }

    public DevicesPageActions savePricesToAssert(){
        SessionObjects.setPlatnoscNaStart(doZaplatyNaStartTxt.text());
        SessionObjects.setOplataMiesieczna(doZaplatyMiesiecznieTxt.text());
        return this;
    }

}
