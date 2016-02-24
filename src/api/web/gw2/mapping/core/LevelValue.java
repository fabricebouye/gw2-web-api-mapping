/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The JSON value defines a level value.
 * @author Fabrice Bouyé
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface LevelValue {

    /**
     * The minimum level in the game for characters: {@value}.
     */
    // @todo Configure this from an external property file.
    public static final int MIN_LEVEL = 1;
    /**
     * The maximum level in the game for characters: {@value}.
     * <br>Note: ingame NPCs, creatures or structures may exceed this level.
     */
    // @todo Configure this from an external property file.
    public static final int MAX_LEVEL = 80;
}
