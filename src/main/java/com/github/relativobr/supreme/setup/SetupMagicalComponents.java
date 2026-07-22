package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricatorMagic;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;

public class SetupMagicalComponents {

  public static void setup(Supreme sup) {

    registerMagicalFabricatorMagic(SupremeCetrus.CETRUS_LUMIUM, SupremeCetrus.RECIPE_CETRUS_LUMIUM);

    registerMagicalFabricatorMagic(SupremeCetrus.CETRUS_LUX, SupremeCetrus.RECIPE_CETRUS_LUX);

    registerMagicalFabricatorMagic(SupremeCetrus.CETRUS_VENTUS, SupremeCetrus.RECIPE_CETRUS_VENTUS);

    registerMagicalFabricatorMagic(SupremeCetrus.CETRUS_AQUA, SupremeCetrus.RECIPE_CETRUS_AQUA);

    registerMagicalFabricatorMagic(SupremeCetrus.CETRUS_IGNIS, SupremeCetrus.RECIPE_CETRUS_IGNIS);

    registerMagicalFabricatorMagic(SupremeAttribute.getMagic(), SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC);

    registerMagicalFabricatorMagic(SupremeAttribute.getBomb(), SupremeAttribute.RECIPE_ATTRIBUTE_BOMB);

    registerMagicalFabricatorMagic(SupremeAttribute.getFortune(), SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE);

    registerMagicalFabricatorMagic(SupremeAttribute.getImpetus(), SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS);

  }
}
