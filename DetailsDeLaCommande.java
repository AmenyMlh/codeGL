/***********************************************************************
 * Module:  DetailsDeLaCommande.java
 * Author:  DELL
 * Purpose: Defines the Class DetailsDeLaCommande
 ***********************************************************************/

import java.util.*;

/** @pdOid 323e3ab1-54f3-4673-9d22-745980961f71 */
public class DetailsDeLaCommande {
   /** @pdOid 52945f4d-917f-444c-8e8d-f91b68ac445c */
   private int id;
   /** @pdOid 07aa7def-a37e-41ae-8585-413e030d7dcd */
   private int numCmd;
   /** @pdOid f4908d1f-66e5-49f7-8cdd-596cf95db253 */
   private int numProd;
   /** @pdOid 2a6931a1-f996-4c86-a74b-87643396d64e */
   private String nomProd;
   /** @pdOid 3f408eab-1211-49a3-928b-3e68139f8a67 */
   private int quantite;
   /** @pdOid e0532c03-c57e-4109-a39d-2b4a753b66dc */
   private float prixUnitaire;
   /** @pdOid 6d85939b-6855-400a-b97b-aeff3b6f9bda */
   private float sousTotal;
   
   /** @pdOid 86e7d11a-faf0-484d-8dda-beece4376273 */
   public float calculerPrix() {
      // TODO: implement
      return 0;
   }

}