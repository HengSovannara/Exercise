package Homework1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sophea <a href='mailto:smak@dminc.com'> sophea </a>
 * @version $id$ - $Revision$
 * @date 2016
 */
public abstract class CountriesList {
    public static Collection<String> getAllCountries() {
         
        List<String>  countries = new ArrayList<>();
        //ex : we have list of items countries : 
        

        countries.add("Afghanistan");
        countries.add("land Islands");
        countries.add("Albania");
        countries.add("Algeria");
        countries.add("American Samoa");
        countries.add("AndorrA");
        countries.add("Angola");
        countries.add("Anguilla");
        countries.add("Antarctica");
        countries.add("Antigua and Barbuda");
        countries.add("Argentina");
        countries.add("Armenia");
        countries.add("Aruba");
        countries.add("Australia");
        countries.add("Austria");
        countries.add("Azerbaijan");
        countries.add("Bahamas");
        countries.add("Bahrain");
        countries.add("Bangladesh");
        countries.add("Barbados");
        countries.add("Belarus");
        countries.add("Belgium");
        countries.add("Belize");
        countries.add("Benin");
        countries.add("Bermuda");
        countries.add("Bhutan");
        countries.add("Bolivia");
        countries.add("Bosnia and Herzegovina");
        countries.add("Botswana");
        countries.add("Bouvet Island");
        countries.add("Brazil");
        countries.add("British Indian Ocean Territory");
        countries.add("Brunei Darussalam");
        countries.add("Bulgaria");
        countries.add("Burkina Faso");
        countries.add("Burundi");
        countries.add("Cambodia");
        countries.add("Cameroon");
        countries.add("Canada");
        countries.add("Cape Verde");
        countries.add("Cayman Islands");
        countries.add("Central African Republic");
        countries.add("Chad");
        countries.add("Chile");
        countries.add("China");
        countries.add("Christmas Island");
        countries.add("Cocos (Keeling) Islands");
        countries.add("Colombia");
        countries.add("Comoros");
        countries.add("Congo");
        countries.add("Congo, The Democratic Republic of the");
        countries.add("Cook Islands");
        countries.add("Costa Rica");
        countries.add("Cote D\"Ivoire");
        countries.add("Croatia");
        countries.add("Cuba");
        countries.add("Cyprus");
        countries.add("Czech Republic");
        countries.add("Denmark");
        countries.add("Djibouti");
        countries.add("Dominica");
        countries.add("Dominican Republic");
        countries.add("Ecuador");
        countries.add("Egypt");
        countries.add("El Salvador");
        countries.add("Equatorial Guinea");
        countries.add("Eritrea");
        countries.add("Estonia");
        countries.add("Ethiopia");
        countries.add("Falkland Islands (Malvinas)");
        countries.add("Faroe Islands");
        countries.add("Fiji");
        countries.add("Finland");
        countries.add("France");
        countries.add("French Guiana");
        countries.add("French Polynesia");
        countries.add("French Southern Territories");
        countries.add("Gabon");
        countries.add("Gambia");
        countries.add("Georgia");
        countries.add("Germany");
        countries.add("Ghana");
        countries.add("Gibraltar");
        countries.add("Greece");
        countries.add("Greenland");
        countries.add("Grenada");
        countries.add("Guadeloupe");
        countries.add("Guam");
        countries.add("Guatemala");
        countries.add("Guernsey");
        countries.add("Guinea");
        countries.add("Guinea-Bissau");
        countries.add("Guyana");
        countries.add("Haiti");
        countries.add("Heard Island and Mcdonald Islands");
        countries.add("Holy See (Vatican City State)");
        countries.add("Honduras");
        countries.add("Hong Kong");
        countries.add("Hungary");
        countries.add("Iceland");
        countries.add("India");
        countries.add("Indonesia");
        countries.add("Iran, Islamic Republic Of");
        countries.add("Iraq");
        countries.add("Ireland");
        countries.add("Isle of Man");
        countries.add("Israel");
        countries.add("Italy");
        countries.add("Jamaica");
        countries.add("Japan");
        countries.add("Jersey");
        countries.add("Jordan");
        countries.add("Kazakhstan");
        countries.add("Kenya");
        countries.add("Kiribati");
        countries.add("Korea, Democratic People\"S Republic of");
        countries.add("Korea, Republic of");
        countries.add("Kuwait");
        countries.add("Kyrgyzstan");
        countries.add("Lao People\"S Democratic Republic");
        countries.add("Latvia");
        countries.add("Lebanon");
        countries.add("Lesotho");
        countries.add("Liberia");
        countries.add("Libyan Arab Jamahiriya");
        countries.add("Liechtenstein");
        countries.add("Lithuania");
        countries.add("Luxembourg");
        countries.add("Macao");
        countries.add("Macedonia, The Former Yugoslav Republic of");
        countries.add("Madagascar");
        countries.add("Malawi");
        countries.add("Malaysia");
        countries.add("Maldives");
        countries.add("Mali");
        countries.add("Malta");
        countries.add("Marshall Islands");
        countries.add("Martinique");
        countries.add("Mauritania");
        countries.add("Mauritius");
        countries.add("Mayotte");
        countries.add("Mexico");
        countries.add("Micronesia, Federated States of");
        countries.add("Moldova, Republic of");
        countries.add("Monaco");
        countries.add("Mongolia");
        countries.add("Montenegro");
        countries.add("Montserrat");
        countries.add("Morocco");
        countries.add("Mozambique");
        countries.add("Myanmar");
        countries.add("Namibia");
        countries.add("Nauru");
        countries.add("Nepal");
        countries.add("Netherlands");
        countries.add("Netherlands Antilles");
        countries.add("New Caledonia");
        countries.add("New Zealand");
        countries.add("Nicaragua");
        countries.add("Niger");
        countries.add("Nigeria");
        countries.add("Niue");
        countries.add("Norfolk Island");
        countries.add("Northern Mariana Islands");
        countries.add("Norway");
        countries.add("Oman");
        countries.add("Pakistan");
        countries.add("Palau");
        countries.add("Palestinian Territory, Occupied");
        countries.add("Panama");
        countries.add("Papua New Guinea");
        countries.add("Paraguay");
        countries.add("Peru");
        countries.add("Philippines");
        countries.add("Pitcairn");
        countries.add("Poland");
        countries.add("Portugal");
        countries.add("Puerto Rico");
        countries.add("Qatar");
        countries.add("Reunion");
        countries.add("Romania");
        countries.add("Russian Federation");
        countries.add("RWANDA");
        countries.add("Saint Helena");
        countries.add("Saint Kitts and Nevis");
        countries.add("Saint Lucia");
        countries.add("Saint Pierre and Miquelon");
        countries.add("Saint Vincent and the Grenadines");
        countries.add("Samoa");
        countries.add("San Marino");
        countries.add("Sao Tome and Principe");
        countries.add("Saudi Arabia");
        countries.add("Senegal");
        countries.add("Serbia");
        countries.add("Seychelles");
        countries.add("Sierra Leone");
        countries.add("Singapore");
        countries.add("Slovakia");
        countries.add("Slovenia");
        countries.add("Solomon Islands");
        countries.add("Somalia");
        countries.add("South Africa");
        countries.add("South Georgia and the South Sandwich Islands");
        countries.add("Spain");
        countries.add("Sri Lanka");
        countries.add("Sudan");
        countries.add("Suriname");
        countries.add("Svalbard and Jan Mayen");
        countries.add("Swaziland");
        countries.add("Sweden");
        countries.add("Switzerland");
        countries.add("Syrian Arab Republic");
        countries.add("Taiwan, Province of China");
        countries.add("Tajikistan");
        countries.add("Tanzania, United Republic of");
        countries.add("Thailand");
        countries.add("Timor-Leste");
        countries.add("Togo");
        countries.add("Tokelau");
        countries.add("Tonga");
        countries.add("Trinidad and Tobago");
        countries.add("Tunisia");
        countries.add("Turkey");
        countries.add("Turkmenistan");
        countries.add("Turks and Caicos Islands");
        countries.add("Tuvalu");
        countries.add("Uganda");
        countries.add("Ukraine");
        countries.add("United Arab Emirates");
        countries.add("United Kingdom");
        countries.add("United States");
        countries.add("United States Minor Outlying Islands");
        countries.add("Uruguay");
        countries.add("Uzbekistan");
        countries.add("Vanuatu");
        countries.add("Venezuela");
        countries.add("Viet Nam");
        countries.add("Virgin Islands, British");
        countries.add("Virgin Islands, U.S.");
        countries.add("Wallis and Futuna");
        countries.add("Western Sahara");
        countries.add("Yemen");
        countries.add("Zambia");
        countries.add("Zimbabwe");
        
        return countries;
    }
    
    
    public static void main(String[] args){
    	
    	/* 
    	Iterator itr= getAllCountries().iterator();
    	while(itr.hasNext()){
    	System.out.println(itr.next());
    	} 
    	*/
    	/*for(String obj:getAllCountries()){
    		System.out.println(obj);
    	} */
    	//reverse();
    }
}