import edu.duke.*;
import java.util.Scanner;
/**
 * @author ESHANK TYAGI
 * @version (25/02/2023)
 */ 
public class CurrencyExchangaXpsiace {
    private static String url="",fromCur="",toCur="",
                          getcur[] = {  "AFN","ALL","DZD","AOA","ARS","AMD","AWG","AUD","AZN","BSD","BHD","BDT","BBD","BYN","BZD",
                                        "BMD","BTN","BOB","BAM","BWP","BRL","GBP","BND","BGN","BIF","XOF","XAF","XPF","KHR","CAD",
                                        "CVE","KYD","CLP","CLF","CNY","COP","KMF","CDF","CRC","CUC","CUP","CZK","DKK","DJF","DOP",
                                        "XCD","EGP","ERN","ETB","EUR","FKP","FJD","GMD","GEL","GHS","GIP","XAU","GTQ","GNF","GYD",
                                        "HTG","HNL","HKD","HUF","ISK","INR","IDR","IRR","IQD","ILS","JMD","JPY","JOD","KZT","KES",
                                        "HRK","KWD","KGS","LAK","LVL","LBP","LSL","LRD","LYD","LTL","MOP","MKD","MGA","MWK","MYR",
                                        "MVR","MRU","MUR","MXV","MXN","MDL","MNT","MAD","MZN","MMK","NAD","NPR","ANG","TWD","NZD",
                                        "NIO","NGN","KPW","NOK","OMR","PKR","XPD","PAB","PGK","PYG","PEN","PHP","XPT","PLN","QAR",
                                        "RON","RUB","RWF","SHP","SVC","WST","SAR","RSD","SCR","SLL","XAG","SGD","SBD","SOS","ZAR",
                                        "KRW","XDR","LKR","SDG","SRD","SZL","SEK","CHF","SYP","STN","TJS","TZS","THB","TOP","TTD",
                                        "TND","TRY","TMT","USD","UGX","UAH","AED","UYU","UZS","VUV","VES","VND","YER","ZMW","ZWL"},
                          getcurname[] = {"Afghan Afghani","Albanian Lek","Algerian Dinar","Angolan Kwanza","Argentine Peso","Armenian Dram",
                                        "Aruban Florin","Australian Dollar","Azerbaijan Manat","Bahamian Dollar","Bahraini Dinar",
                                        "Bangladeshi Taka","Barbadian Dollar","Belarusian Ruble","Belize Dollar","Bermudan Dollar",
                                        "Bhutanese Ngultrum","Bolivian Boliviano","Bosnia-Herzegovina Convertible Mark","Botswanan Pula",
                                        "Brazilian Real","British Pound Sterling","Brunei Dollar","Bulgarian Lev","Burundian Franc",
                                        "CFA Franc BCEAO","CFA Franc BEAC","CFP Franc","Cambodian Riel","Canadian Dollar","Cape Verdean Escudo",
                                        "Cayman Islands Dollar","Chilean Peso","Chilean Unit of Account (UF)","Chinese Yuan","Colombian Peso",
                                        "Comorian Franc","Congolese Franc","Costa Rican Col?n","Cuban Convertible Peso","Cuban Peso",
                                        "Czech Republic Koruna","Danish Krone","Djiboutian Franc","Dominican Peso","East Caribbean Dollar",
                                        "Egyptian Pound","Eritrean Nakfa","Ethiopian Birr","Euro","Falkland Islands Pound","Fijian Dollar",
                                        "Gambian Dalasi","Georgian Lari","Ghanaian Cedi","Gibraltar Pound","Gold","Guatemalan Quetzal",
                                        "Guinean Franc","Guyanaese Dollar","Haitian Gourde","Honduran Lempira","Hong Kong Dollar",
                                        "Hungarian Forint","Icelandic Kr?na","Indian Rupee","Indonesian Rupiah","Iranian Rial","Iraqi Dinar",
                                        "Israeli New Sheqel","Jamaican Dollar","Japanese Yen","Jordanian Dinar","Kazakhstani Tenge",
                                        "Kenyan Shilling","Kuna","Kuwaiti Dinar","Kyrgystani Som","Lao Kip","Latvian Lats","Lebanese Pound",
                                        "Lesotho Loti","Liberian Dollar","Libyan Dinar","Lithuanian Litas","Macanese Pataca","Macedonian Denar",
                                        "Malagasy Ariary","Malawian Malawi Kwacha","Malaysian Ringgit","Maldivian Rufiyaa","Mauritanian Ouguiya",
                                        "Mauritian Rupee","Mexican Investment Unit","Mexican Peso","Moldovan Leu","Mongolian Tugrik",
                                        "Moroccan Dirham","Mozambican Metical","Myanma Kyat","Namibian Dollar","Nepalese Rupee",
                                        "Netherlands Antillean Guilder","New Taiwan Dollar","New Zealand Dollar","Nicaraguan C?rdoba",
                                        "Nigerian Naira","North Korean Won","Norwegian Krone","Omani Rial","Pakistani Rupee","Palladium",
                                        "Panamanian Balboa","Papua New Guinean Kina","Paraguayan Guarani","Peruvian Sol","Philippine Peso",
                                        "Platinum","Polish Zloty","Qatari Rial","Romanian Leu","Russian Ruble","Rwandan Franc",
                                        "Saint Helena Pound","Salvadoran Col?n","Samoan Tala","Saudi Riyal","Serbian Dinar","Seychellois Rupee",
                                        "Sierra Leonean Leone","Silver","Singapore Dollar","Solomon Islands Dollar","Somali Shilling",
                                        "South African Rand","South Korean Won","Special Drawing Rights","Sri Lankan Rupee","Sudanese Pound",
                                        "Surinamese Dollar","Swazi Lilangeni","Swedish Krona","Swiss Franc","Syrian Pound",
                                        "Sao Tom? and Pr?ncipe Dobra","Tajikistani Somoni","Tanzanian Shilling","Thai Baht","Tongan Pa?anga",
                                        "Trinidad and Tobago Dollar","Tunisian Dinar","Turkish Lira","Turkmenistani Manat","US Dollar",
                                        "Ugandan Shilling","Ukrainian Hryvnia","United Arab Emirates Dirham","Uruguayan Peso","Uzbekistan Som",
                                        "Vanuatu Vatu","Venezuelan Bol?var Soberano","Vietnamese Dong","Yemeni Rial","ZMW","Zimbabwean Dollar (2009)" };
    public static void main(){
        Scanner sc = new Scanner(System.in);
        printCurChc();
        //System.out.println(" \n1. Indian Rupees (INR) \n2. United States Dollors (USD) \n3. British Pound (GBP) \n4. Euro (EUR)\n>(Note:enter numerical values: eg-1,4...)");
        System.out.print("Choose a Currency to Convert FROM : ");
        //fromCur = getCur(sc.nextInt());
        fromCur = getcur[sc.nextInt()-1];
        System.out.print("Choose a Currency to Convert TO : ");
        //toCur = getCur(sc.nextInt());
        toCur = getcur[sc.nextInt()-1];
        url = "https://www.google.com/finance/quote/"+fromCur+"-"+toCur;
        URLResource urlres = new URLResource(url);
        String web = urlres.asString();
        double value = Double.parseDouble(web.substring(
                       web.indexOf("<div class=\"YMlKec fxKbKc\">")+27,
                       web.indexOf("</div>",web.indexOf("<div class=\"YMlKec fxKbKc\">"))));
        System.out.println("From : "+fromCur+", To : "+toCur+", Value : "+web.substring(
                       web.indexOf("<div class=\"YMlKec fxKbKc\">")+27,
                       web.indexOf("</div>",web.indexOf("<div class=\"YMlKec fxKbKc\">"))));
        System.out.print("Enter the Amount to Convert : ");
        System.out.print("Your Converted Amount is : "+(sc.nextDouble()*value));
        //System.out.println("Value : "+value);
    }
    private static void printCurChc(){
        System.out.println("\nAvailable Currency Exchanges :-");
        for(int i=0; i<getcurname.length; i++){
            System.out.println((i+1)+". "+getcurname[i]);
        }
    }
}
