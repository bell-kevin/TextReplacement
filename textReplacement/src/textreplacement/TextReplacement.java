package textreplacement;

public class TextReplacement {

    public static void main(String[] args) {
        String ladyMacbeth = "Out, danged spot! Out, I say!";
        System.out.println(ladyMacbeth.replaceAll("Out", "Expunge"));
        ladyMacbeth = ladyMacbeth.replaceFirst(", danged spot", "");
        System.out.println(ladyMacbeth);
    }
}
