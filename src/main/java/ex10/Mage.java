package ex10;

public class Mage {
    private String name;
    private int level;
    private int damage;
    private String type;


    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo(){
        return String.format("%s, %d, %d, %s", name, level, damage, type);
    }

    public String fight(Mage mage){
        String opponentType = mage.type;
        if(this.type.equals(mage.type)){
            if(this.level > mage.level) return this.name;
            else if(this.level < mage.level) return  mage.name;
            else{
                if(this.damage > mage.damage) return  this.name;
                else if(this.damage < mage.damage) return mage.name;

            }
        }
        else if(this.type.equals("fire")){
            if(opponentType.equals("ice")) return this.name;
            else if(opponentType.equals("earth")) return mage.name;
        }else if(this.type.equals("ice")){
            if(opponentType.equals("earth")) return  this.name;
            else if(opponentType.equals("fire")) return  mage.name;
        }else{
            if(opponentType.equals("fire")) return  this.name;
            else if(opponentType.equals("ice")) return  mage.name;
        }
        return "draw";
    }
}
