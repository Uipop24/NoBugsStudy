package practice4.Task8;

public class Manuscript implements Exhibit{
    @Override
    public void history() {
        System.out.println("История манускрипта доступна по ссылке");
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипт — требует контролируемой влажности");
    }
}
