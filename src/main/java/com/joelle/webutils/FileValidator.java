package com.joelle.webutils;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.webApp.model.FileBucket;

@Component
public class FileValidator implements Validator {
	
	public boolean supports(Class<?> clazz) {
		return FileBucket.class.isAssignableFrom(clazz);
	}

	public void validate(Object obj, Errors errors) {
		FileBucket file = (FileBucket) obj;
		
		if(file.getFile()!=null){
			if (file.getFile().getSize() == 0) {
				errors.rejectValue("file", "missing.file");
			}
		}
	}
	
	public void deleteFile(long id, String fileName){
    	try{
    		File file = new File("C:\\JavaTutorials\\images\\"+id+"\\"+fileName+"");

    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}

    	}catch(Exception e){

    		e.printStackTrace();

    	}

    }
	
	public void savetoFileSystem(FileBucket fileBucket, long id) throws IOException{
		 
        String temp = "C:\\temp\\";
        String destDir = "C:\\JavaTutorials\\images\\"+id+"\\";                        
        String profiles = "C:\\JavaTutorials\\images\\"+id+"\\profile\\";
        File dir = new File(destDir);
        File profile = new File(profiles);
        File tmp = new File(temp);
        if(!dir.exists()){                                    	 
        	new File(destDir).mkdirs();                                        
         }
        if(!tmp.exists()){
        	new File(temp).mkdirs();  
          } 
        if(!profile.exists()){                                    	
            new File(profiles).mkdirs();
           }    
        String destFile = fileBucket.getFile().getOriginalFilename();
        FileCopyUtils.copy(fileBucket.getFile().getBytes(), new File(destDir + "/" + destFile));
        FileCopyUtils.copy(fileBucket.getFile().getBytes(), new File(profiles + "/" + destFile)); 
			
		}
    
    public void saveMultiFileSystem(FileBucket fileBucket, long id) throws IOException{
		 
        String temp = "C:\\temp\\";
        String destDir = "C:\\JavaTutorials\\images\\"+id+"\\";                        
       
        File dir = new File(destDir);
        
        File tmp = new File(temp);
        if(!dir.exists()){                                    	 
        	new File(destDir).mkdirs();                                        
         }
        if(!tmp.exists()){
        	new File(temp).mkdirs();  
          } 
         
        String destFile = fileBucket.getFile().getOriginalFilename();
        FileCopyUtils.copy(fileBucket.getFile().getBytes(), new File(destDir + "/" + destFile));
        	
		}
   
}