/***********************************************************************
 * Module:  Paiement.java
 * Author:  DELL
 * Purpose: Defines the Class Paiement
 ***********************************************************************/

import java.util.*;

/** @pdOid d3eb0e46-a357-430a-a9e7-22abb8f6499b */
public class Paiement {
   /** @pdOid 97e3f38c-4ece-4fcb-979b-bf70ac7a0a87 */
   private int id;
   
   /** @pdRoleInfo migr=no name=Panier assc=concerne mult=1..1 */
   public Panier panier;
   
   /** @pdOid b0014163-b4b9-4942-beab-a1a4d7fdf852 */
   public void effectuerPaiement() {
      // TODO: implement
   }

}