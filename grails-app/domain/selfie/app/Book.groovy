package selfie.app

import com.bertramlabs.plugins.selfie.Attachment

class Book {
	
	String name
	Attachment photo
	
    static constraints = {
		name blank:false
		photo contentType: ['jpg','png'], fileSize:1024*1024
    }
	
	static attachmentOptions = [
		photo: [
			styles: [
				thumb: [width: 50, height: 50, mode: 'fit'],
				medium: [width: 250, height: 250, mode: 'scale']
			]
		]
	]
	
	static embedded = ['photo'] //required
}
