import greenfoot.*; 

public class MyWorld extends World
{
    public boolean GAMEOVER=false;
    private int mscore=0;
    private Score score;
    public MyWorld()
    {    
        super(600, 400, 1,false); 

        Kepala kepala=new Kepala();
        addObject(kepala,100,200);

        Ular ular=new Ular();
        addObject(ular,kepala.getX()-Ular.delta,kepala.getY());
        ular.ular=kepala;

        addMakanan();

        score=new Score();
        score.setScore(mscore);
        addObject(score,getWidth()-50,25);
        prepare();
    }

    public void addMakanan()
    {
        addObject(new Makanan(),Greenfoot.getRandomNumber(getWidth()/Ular.delta)*Ular.delta,Greenfoot.getRandomNumber(getHeight()/Ular.delta)*Ular.delta);
    }

    public void setScore(int a)
    {
        mscore+=a;
        score.setScore(mscore);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
