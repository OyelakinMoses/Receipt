import java.util.Scanner;

        public class MainProgram {
            public static void main(String[] args) {
                double prixDeChaussure;
                double prixDeJeans;
                double prixDehabille;
                String NomDuClient, NumeroDeTelephone;
                int NombreDeChaussure, NombreDeJeans, NombreDehabille;
                int NombreTotalDArticle;
                double TotalDeChaussure, TotalDeJeans, TotalDhabille;
                double TotalCommander;
                short JourCommander, MoisCommander, AnneéCommander;
                final double TaxDescompte =0.15;
                Scanner sc = new Scanner(System.in);
                //sc es un objet du scanner classe

                //Entre les details du client
                System.out.println("BIENVENUE CHEZ B.MICHELLE BOUTIQUE 👟👖👕 ");
                System.out.println("S'IL VOUS PLAÎT LE NOM DU CLIENT:  ");

                NomDuClient = sc.next();
                System.out.println("S'IL VOUS PLAÎT ENTRE LE NUMERO DU CLIENT:  ");

                NumeroDeTelephone = sc.next();
                System.out.println("\nENTRE LE PRIX DE CHAUSSURE: ");
                prixDeChaussure = sc.nextDouble();
                System.out.println("\nENTRE LE PRIX DE JEANS: ");
                prixDeJeans = sc.nextDouble();
                System.out.println("\nENTRE LE PRIX DE HABILLE: ");
                prixDehabille = sc.nextDouble();

                System.out.println("\nENTRE LE NOMBRE DE CHAUSSURE ACHETER: ");
                NombreDeChaussure = sc.nextInt();
                System.out.println("\nENTRE LE NOMBRE DE JEANS ACHETER: ");
                NombreDeJeans = sc.nextInt();
                System.out.println("\nENTRE LE NOMBRE DE HABILLE ACHETER: ");
                NombreDehabille = sc.nextInt();

                System.out.println("\nENTRE LES DETAILS DE TRANSACTION CI-DESSOUS" );
                System.out.println("************************************************************");
                System.out.print("ENTRE LE JOUR: ");
                JourCommander = sc.nextShort();
                System.out.print("ENTRE LE  MOIS: ");
                MoisCommander = sc.nextShort();
                System.out.print("ENTRE L'ANNEE: ");
                AnneéCommander = sc.nextShort();

                NombreTotalDArticle = NombreDeChaussure + NombreDeJeans +NombreDehabille;
                TotalDeChaussure = NombreDeChaussure * prixDeChaussure;
                TotalDeJeans = NombreDeJeans * prixDeJeans;
                TotalDhabille = NombreDehabille * prixDehabille;

                TotalCommander = TotalDeChaussure + TotalDeJeans + TotalDhabille;

                System.out.println("\n-/-\t BIENVENUE CHEZ B.MICHELLE BOUTIQUE 👟👖👕\t-/-");
                System.out.println("==========================================================");
                System.out.println("CLIENT: "+NomDuClient);
                System.out.println("NUMERO DU CLIENT: "+NumeroDeTelephone);
                System.out.println("JOUR DE LA COMMANDE: "+JourCommander+"/"+MoisCommander+"/"+AnneéCommander);

                System.out.println("---------------------------------------------------------");
                System.out.println("Article\tqty\tUnit/Price\tSous-Total");

                System.out.println("Chaussure\t" + NombreDeChaussure +"\t$"+prixDeChaussure + "\t\t$"+TotalDeChaussure);
                System.out.println("Jeans\t" + NombreDeJeans +"\t$"+prixDeJeans + "\t\t$"+TotalDeJeans);
                System.out.println("Habille\t"+NombreDehabille+"\t$"+prixDehabille +"\t\t$"+TotalDhabille) ;

                System.out.println("-----------------------------------------------------------");
                System.out.println("NONBRE D'ARTICLES: " +NombreTotalDArticle);
                System.out.println("TOTAL COMMANDER: $"+TotalCommander);
                System.out.println("REDUCTION TOTAL:$"+TotalCommander* TaxDescompte);
                System.out.println("===================================================");
                System.out.println("PROGRAMME CREER PAR SN🏀🏀VE");
                System.out.println("JOB:36");
            }
        }

