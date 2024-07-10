// modification to Fig. 17.3: List.java
// ListNode and List class definitions.
package listaobjetos;

// class List definition
public class List 
{
   private static final int MAXNODES = 40;
   private static Object[] data = new Object[MAXNODES];
   private static int[] nextNode = new int[MAXNODES];
   
   private int firstNode;
   private int lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty List with "list" as the name
   public List() 
   { 
      this( "list" ); 
   } // end List no-argument constructor

   // constructor creates an empty List with a name
   public List( String listName )
   {	  
      name = listName;
      firstNode = lastNode = -1;
   } // end List one-argument constructor

   // insert Object at front of List
   public void insertAtFront( Object insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same object
         firstNode = lastNode = newListNode(insertItem);
      else // firstNode refers to new node
         firstNode = newListNode( insertItem, firstNode );
   } // end method insertAtFront

   // insert Object at end of List
   public void insertAtBack( Object insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same Object
         firstNode = lastNode = newListNode( insertItem );
      else // lastNode's nextNode refers to new node
         lastNode = nextNode[lastNode] = newListNode(insertItem);
   } // end method insertAtBack

   // remove first node from List
   public Object removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      Object removedItem = data[firstNode]; // retrieve data being removed
      int nodeToFree = firstNode; 
      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = -1;
      else
         firstNode = nextNode[firstNode];
      
      freeNode(nodeToFree);
      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from List
   public Object removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      Object removedItem = data[lastNode]; // retrieve data being removed
      int nodeToFree = lastNode; 
      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = -1;
      else // locate new last node
      { 
         int current = firstNode;

         // loop while current node does not refer to lastNode
         while ( nextNode[current] != lastNode )
            current = nextNode[current];
   
         lastNode = current; // current is new lastNode
         nextNode[current] = -1;
      } // end else

      freeNode(nodeToFree); 
      return removedItem; // return removed node data
   } // end method removeFromBack

   // determine whether list is empty
   public boolean isEmpty()
   { 
      return firstNode == -1; // return true if list is empty
   } // end method isEmpty

   // output list contents
   public void print()
   {
      if ( isEmpty() ) 
      {
         System.out.printf( "Empty %s\n", name );
         return;
      } // end if

      System.out.printf( "The %s is: ", name );
      int current = firstNode;

      // while not at end of list, output current node's data
      while ( current != -1 ) 
      {
         System.out.printf( "%s ", data[current] );
         current = nextNode[current];
      } // end while

      System.out.println( "\n" );
   } // end method prin
   //----------------------------------------------------------
   private int findSpace(){
   	   int next;
   	   for (next=0; next < data.length; next++)
   	   	if (data[next] == null)
   	   	    break;
   	   if (next != data.length)
   	      return next;
   	   return -1;
   }
   
   private void freeNode(int node){
   	   data[node] = null;
       nextNode[node] = -1;
   }
   
   private int newListNode(Object object){
       return newListNode( object, -1 );
   }
   
   private int newListNode(Object object, int node){
   	int freeSpace = findSpace();
   	   
        if (freeSpace != -1){
   	    data[freeSpace] = object;
            nextNode[freeSpace] = node;
        }
        return freeSpace;
   }
   
} // end class List
