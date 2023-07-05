package com.bootcoding.oops;

public class ObjectAsParameter {


        public static void main(String[] args) {
            Remote remote  = new Remote("Videocon", "Gray", 95.00);

            ObjectAsParameter.isRemoteBlack(remote);
            String ispricelable=isprice(remote);
            ObjectAsParameter.isprice(remote);
        }

        //static - class
        //

        public static boolean isRemoteBlack(Remote remote){
            if(remote.color.equals("Black")){
                return true;
            }
            return false;
        }

        // Remote - expensive affordable cheaper

        public static String isprice(Remote remote){

            if(remote.price>=125.00){

                return "Expensive";
            } if (remote.price>=115.00){


                return "Affordable";
            }
            return "cheaper";

        }
}
