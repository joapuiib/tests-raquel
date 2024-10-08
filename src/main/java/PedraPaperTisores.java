public class PedraPaperTisores {
    /**
     * Retorna 0 si hi ha un empat; 1 si guanya el jugador 1 i 2 si guanya el jugador 2.
     * @param player1
     * @param player2
     * @return
     */
    public static int compare(String player1, String player2) {
        if(player1.equals("pedra")){
            if(player2.equals("paper")){
                return 2;
            } else if (player2.equals("tisores")){
                return 1;
            }
        }
        return 0;
    }
}
