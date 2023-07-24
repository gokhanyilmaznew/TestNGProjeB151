package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{
                {"Ankara","IcAnadolu","06"},
                {"Izmir","Ege","35"},
                {"Dyarbakir","Dogu","21"}};
    }
}
