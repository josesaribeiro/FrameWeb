package br.ufes.inf.nemo.frameweb.utils;

import java.nio.file.NotDirectoryException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

public class IFolderUtils {
	
	/**
	 * Cria IFolder's em cascata dentro de um dado IFolder
	 * 
	 * @param srcFolder
	 * @param foldersName
	 * @throws NotDirectoryException 
	 */
	public static void makeDirectory(IFolder srcFolder, String packagePath) {
		try {
			IFolder currentFolder = srcFolder;
			
			for (String folder : packagePath.split("/")) {
				currentFolder = currentFolder.getFolder(folder);
				
				if (!currentFolder.exists()) {
					currentFolder.create(true, true, null);
				}
			}
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Transforma pacotes com qualquer separador além de "/" para caminhos de OS
	 * 
	 * @param packageName
	 * @return packagePath
	 */
	public static String packageNameToPath(String packageName) {
		return packageName.replaceAll("[^A-Za-z0-9]", "/").toLowerCase();
	}
	
}
