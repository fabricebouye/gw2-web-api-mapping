/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Base interface for a skin details.
 * @author Fabrice Bouyé
 */
@ImplementationSpecific
@APIv2(endpoint = "v2/skins") // NOI18N.
public interface SkinDetails {
}