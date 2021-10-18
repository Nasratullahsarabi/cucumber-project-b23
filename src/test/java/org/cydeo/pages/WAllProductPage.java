package org.cydeo.pages;

import org.cydeo.utility.BrowserUtil;
import org.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WAllProductPage {

    @FindBy(xpath = "//table[@class='ProductsTable']//tr/th")
    private List<WebElement> allHeaderRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[2]/td")
    private List<WebElement> firstRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[3]/td")
    private List<WebElement> secondRowCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[4]/td")
    private List<WebElement> thirdRowCells;



    public WAllProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public List<String> getAllHeaderText(){

//        List<String> allTextLst = new ArrayList<>();
//
//        for (WebElement eachElement : allHeaderRowCells) {
//            allTextLst.add(eachElement.getText());
//        }


        return BrowserUtil.getAllText(allHeaderRowCells);
    }

    public Map<String, String> getRowMapFromWebTable(){

        Map<String, String> rowMap = new LinkedHashMap<>();

        List<String> allHeaders = BrowserUtil.getAllText(allHeaderRowCells);
        List<String> allFirstRow = BrowserUtil.getAllText(firstRowCells);
        List<String> allSecondRow = BrowserUtil.getAllText(secondRowCells);
        List<String> allThirdRow = BrowserUtil.getAllText(thirdRowCells);

//        rowMap.put(allHeaders.get(0), allFirstRow.get(0) );
//        rowMap.put(allHeaders.get(1), allFirstRow.get(1) );
//        rowMap.put(allHeaders.get(2), allFirstRow.get(2) );

        for (int i = 0; i < allHeaders.size(); i++) {
            rowMap.put(allHeaders.get(i), allFirstRow.get(i) );

        }
        return rowMap;
    }
}
