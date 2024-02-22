public class Main{ public static void main(String[] args){
System.out.println("Enter the error message:");
  String content="Mahabaliburam is __unesco@recongized site";//"Mahabaliburam is __unesco@recongized site"
//i am working of the        school of i9lka/|o in the m9rignt &sdfnk"
  content=content.trim();
  System.out.println("Removed all special characters: "+content);
  String clean="";
  for(int i=0;i<content.length();i++){
      //this if block is to make each and every word of first character as capital

	  if(content.charAt(i)>='A'&& content.charAt(i)<='Z'||content.charAt(i)>='a'&&content.charAt(i)<='z'||content.charAt(i)==' '){
		  clean+=content.charAt(i);
      }
      else{
          if(clean.endsWith(" ")){            
              continue;
          }
          else{
        	  if(content.charAt(i)>='0' && content.charAt(i)<='9') {
        		  continue;
        	  }
              clean+=" ";
          }
      }
  }
  System.out.println("cleaned:"+clean);
  String result="";
  for(int i=0;i<clean.length();i++) {
	  if((i==0 && clean.charAt(i)>='a' && clean.charAt(i)<='z' )||( i!=0&& (clean.charAt(i-1)==' ') && (clean.charAt(i)>='a' && clean.charAt(i)<='z'))) {
		  char add=(char)(clean.charAt(i)-32);
		  result+=add;
	  }
	  else {
		  if(clean.charAt(i)==' '&&clean.charAt(i-1)==' ') {
			  continue;
		  }
		  result+=clean.charAt(i);
	  }
	  
  }
  System.out.println("The final output after filter all special characters and making first character of each word into Captial");
  System.out.println("==============================================================================================\nfinal output is below 🙂: ");
  System.out.println("\t\t\t"+result);
