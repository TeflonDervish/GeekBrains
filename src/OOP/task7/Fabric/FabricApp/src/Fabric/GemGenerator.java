package OOP.task7.Fabric.FabricApp.src.Fabric;


import OOP.task7.Fabric.FabricApp.src.Interface.iGameItem;
import OOP.task7.Fabric.FabricApp.src.Product.Gem;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Gem();
    }
    
}
