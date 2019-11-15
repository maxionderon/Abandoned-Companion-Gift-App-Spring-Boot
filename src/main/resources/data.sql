INSERT INTO `affiliation` VALUES (1,'Agent'),(2,'Bounty Hunter'),(3,'Consular'),(4,'Inquisitor'),(5,'Knight'),(6,'Smuggler'),(7,'Trooper'),(8,'Warrior'),(9,'Empire'),(10,'Republic');

INSERT INTO `companion` VALUES (27,'SIS Dossier:
Name: Eckard Lokin (unconfirmed)
Gender: Male
Species: Human
Age: 65 (estimate)
Likes: Clever solutions, long-term thinking, technology, pragmatism
Dislikes: Ideology, honesty, selfish actions without clear long-term gain

Personal History: Age and surname suggest Lokin was born on Dromund Kaas during the pre-war years. Files acquired during Operation: Freefall reference a \"Doctor E. Lokin\" working as Science and Medical Advisor to Kaas City military police during this period, but no visual is provided.

First confirmed sighting was during the boarding of Imperial dreadnought Warhammer--Lokin was one of the two individuals aboard who evaded capture. Interestingly, he was not listed in the crew roster. First identification as Fixer Fifteen came during Operation: Red Cell (see listening post transcripts). Additional sightings and references to the Fixer Fifteen designation uncovered intermittently since.

Analysis: Take a close look at the operations where we caught Lokin, and you''ll notice a pattern--every time he turns up, something big is happening and we can''t figure the role he''s playing. He''s professional, he knows his science and he''s sneaky. We know he rubs some of his colleagues the wrong way, but even his fellow agents haven''t given us anything useful under questioning.

Note by Harson Nild, Director of Core World Operations: Is Lokin still in active service? I remember hearing about a Fixer biologist back in the day, but thought he''d retired years ago.','Eckard Lokin'),
(40,'SIS Dossier:
Name: Raina Temple
Gender: Female
Species: Human
Age: 24
Likes: The Empire, the Sith, duty, honor
Dislikes: Cruelty, casual violence, selfishness

Personal History: Standard searches reveal no Imperial citizenship record for a \"Raina Temple,\" but the usual caveats apply--our data on the Imperial populace remains sadly incomplete. Temple''s skills and attitude suggest Imperial Army training, but her presence inside the Chiss Expansionary Defense Force is extremely unusual; neither the CEDF nor the Imperial military is known for its transfer programs.

Analysis: Personable and bright Imperial military cadets don''t end up embedded with aliens at the far edge of the galaxy without good reason. Temple could be a plant, but it''s just as likely she''s been intentionally forced out of the picture. Best-guess personality profile suggests she''s a typically patriotic example of the rank-and-file Imperial military--a true believer in Imperial superiority and duty. No matter how easygoing or empathetic she may be at times, the needs of her nation have to come first.

Note by SIS Agent Hunter: She''s cute, isn''t she? Enjoy the file, Cipher Nine... we can spare the occasional dossier if you''re willing to play along.','Ensign Raina Temple'),
(53,'Intelligence Profile:
Name: Kaliyo Djannis
Gender: Female
Species: Rattataki
Age: 29 (unconfirmed)
Likes: Disrespecting authority, casual violence, anarchy for the fun of it
Dislikes: Self-sacrifice for the greater good, sincerity, obedience, patriotic spirit and being taken advantage of

Background (Summary): Multiple contradictory accounts make full background assessment difficult. Subject likely born on Rattatak. Escaped homeworld at a young age. Proceeded to find employment as freelance enforcer and assassin for major criminal syndicates (Exchange, Hutt Cartel) and individual underworld figures (Rholl). Persistent links to Brentaal Four anarchist cells (see Revolutionary Edge Brigade). Minimal activity within Imperial borders.

Personality: Kaliyo Djannis prizes her freedom and will lie, murder and blackmail in order to ensure that she is in control of a situation and able to indulge her vices. Known to pursue lengthy vendettas to redress grievances. Possesses a track record of expertly manipulating employers, lovers and associates (agents should not be fooled by attempts at seduction). As with many mercenaries, her loyalty cannot be purchased, but her services can be--if only temporarily.

Notes: No known military training, but extremely capable with assault weapons. Has been known to bite when disarmed.','Kaliyo Djannis');

INSERT INTO `companion_affiliation_mapping` VALUES (27,1),(27,9),(40,1),(40,9),(53,1),(53,9);



INSERT INTO `gift_reaction` VALUES (23,0,'Indifferent'),(24,1,'Like'),(25,2,'Favorite'),(26,3,'Love');

INSERT INTO `gift_type` VALUES (11,'Weapon'),(12,'Military Gear'),(13,'Courting'),(14,'Luxury'),(15,'Technology'),(16,'Republic Memorabilia'),(17,'Imperial Memorabilia'),(18,'Cultural Artifact'),(19,'Trophy'),(20,'Underworld Good'),(21,'Delicacies'),(22,'Maintenance');

INSERT INTO `companion_gift` VALUES (28,NULL,23,18,27),(29,NULL,26,17,27),(30,NULL,23,21,27),(31,NULL,23,13,27),(32,NULL,26,15,27),(33,NULL,24,16,27),(34,NULL,23,11,27),(35,NULL,23,22,27),(36,NULL,25,12,27),(37,NULL,23,19,27),(38,NULL,24,20,27),(39,NULL,25,14,27),(41,NULL,25,12,40),(42,NULL,23,18,40),(43,NULL,23,22,40),(44,NULL,24,14,40),(45,NULL,23,20,40),(46,NULL,24,11,40),(47,NULL,24,16,40),(48,NULL,23,15,40),(49,NULL,23,19,40),(50,NULL,23,21,40),(51,NULL,26,17,40),(52,NULL,24,13,40),(54,NULL,24,12,53),(55,NULL,23,18,53),(56,NULL,25,19,53),(57,NULL,25,11,53),(58,NULL,25,21,53),(59,NULL,23,13,53),(60,NULL,23,22,53),(61,NULL,25,14,53),(62,NULL,23,16,53),(63,NULL,26,20,53),(64,NULL,23,17,53),(65,NULL,24,15,53);

