 

import com.workfusion.studio.rpa.recorder.api.*
import com.workfusion.studio.rpa.recorder.api.types.*
enableTypeOnScreen()



openExcel("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx")    
    try {
            
        input = RString.of(getCell("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx", "A1"))


    } finally {
closeExcel("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx")    }

	timeouts().pageLoadTimeout(10000, java.util.concurrent.TimeUnit.MILLISECONDS)

    openChrome(UrlOperations.ensureProtocol("https://www.google.co.in/search?rlz=1C1CHZL_enIN785IN785&ei=nQmxWvK5HsPivATwiqT4BQ&q=currency+convertor&oq=currency+convertor&gs_l=psy-ab.12...0.0.0.27807.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.SUS_z68F0SQ"))
    sleep(5000)


		$(byXpath("//*[@id=\"knowledge-currency__src-input\"]")).setValue(String.valueOf(input))


            output = RString.of($(byXpath("//*[@id=\"knowledge-currency__tgt-input\"]")).text())

    sleep(2000)
            setClipboardText(output as String)



openExcel("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx")    
    try {
            

        setCell("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx", "B1", "${output}")


saveExcel("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx")    } finally {
closeExcel("C:\\Users\\gunasekar.c\\Desktop\\stockcompany.xlsx")    }




