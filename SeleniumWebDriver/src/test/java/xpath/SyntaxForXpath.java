package xpath;

public class SyntaxForXpath {

	public static void main(String[] args) {
		
		/*      //tagname[@attribute='value']
		 *      //*[@attribute='value']          */
		
		
		 //when u want to use multiple attribute:-
		 /*    //tagname[@attribute='value'][@attribute='value']    */
		
		
		
		//inner text:-
		
		/*       //tagname[text()='']            */
		//or u can replace * with tagname
		
		
		//xpath with contains:-
		
		/*       //tagname[contains(@attribute,'value')]        */
		//u can give partial value also.
		
		//xpath with starts-with:-
		
		/*     //tagname[starts-with(@attribute,'value')]       */		
		 
		//chained xpath:-
		
		/*     //parenttagname[@attribute='value']/childtagname/childtagname  */  
		//the last childtagname is where the element is present

	}

}
