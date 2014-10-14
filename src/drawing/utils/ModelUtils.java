package drawing.utils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import model.drawing.DrawingPackage;
import model.drawing.DrawingScript;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelUtils {

	static {
		// initialize the modeling package
		DrawingPackage.eINSTANCE.eClass();
		
		// initialize the resource registry
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
	}

	public static void save(DrawingScript object, File file) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs
				.createResource(URI.createFileURI(file.getAbsolutePath()));
		r.getContents().add(object);

		Map<String, Object> opts = new HashMap<String, Object>();
		opts.put(XMIResource.OPTION_SCHEMA_LOCATION, true);
		
		r.save(opts);
	}

	public static DrawingScript load(File file) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs
				.createResource(URI.createFileURI(file.getAbsolutePath()));
		r.load(Collections.EMPTY_MAP);
		return (DrawingScript) r.getContents().get(0);		
	}
	
}
