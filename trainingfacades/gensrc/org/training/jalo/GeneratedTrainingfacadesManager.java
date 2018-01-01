/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 1, 2018 6:48:17 AM                      ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingfacadesConstants;

/**
 * Generated class for type <code>TrainingfacadesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingfacadesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("additionalDescription", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute.
	 * @return the additionalDescription - Additional description - Hybris course
	 */
	public String getAdditionalDescription(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getAdditionalDescription requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, TrainingfacadesConstants.Attributes.Product.ADDITIONALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute.
	 * @return the additionalDescription - Additional description - Hybris course
	 */
	public String getAdditionalDescription(final Product item)
	{
		return getAdditionalDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute. 
	 * @return the localized additionalDescription - Additional description - Hybris course
	 */
	public Map<Language,String> getAllAdditionalDescription(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,TrainingfacadesConstants.Attributes.Product.ADDITIONALDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.additionalDescription</code> attribute. 
	 * @return the localized additionalDescription - Additional description - Hybris course
	 */
	public Map<Language,String> getAllAdditionalDescription(final Product item)
	{
		return getAllAdditionalDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description - Hybris course
	 */
	public void setAdditionalDescription(final SessionContext ctx, final Product item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setAdditionalDescription requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, TrainingfacadesConstants.Attributes.Product.ADDITIONALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description - Hybris course
	 */
	public void setAdditionalDescription(final Product item, final String value)
	{
		setAdditionalDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description - Hybris course
	 */
	public void setAllAdditionalDescription(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,TrainingfacadesConstants.Attributes.Product.ADDITIONALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.additionalDescription</code> attribute. 
	 * @param value the additionalDescription - Additional description - Hybris course
	 */
	public void setAllAdditionalDescription(final Product item, final Map<Language,String> value)
	{
		setAllAdditionalDescription( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingfacadesConstants.EXTENSIONNAME;
	}
	
}
