package net.bronit.groovyadditions;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Config {

    public final Configuration configuration;

    public final boolean groovyGUIRecipes;

    public Config(File file) {
        final Configuration confug = new Configuration(file);

        String category;

        try {
            category = "recipe_editor";
            confug.addCustomCategoryComment(category, "GUI Recipe Editor");
            this.groovyGUIRecipes = confug.getBoolean("enableGuiRecipeEditor", category, false, "Enables the creation of recipes in the GUI\nWork only with ModularUI");

        } catch (Exception e) {
            GroovyAdditions.LOGGER.fatal("Fatal error reading config file.", e);
            throw new RuntimeException(e);
        } finally {
            this.configuration = confug;
            if (this.configuration.hasChanged()) {
                this.configuration.save();
            }
        }
    }

}
