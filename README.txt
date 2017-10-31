Para alterar o tipo da tabela utilize:

ALTER TABLE filhotes ADD COLUMN ndatadesmama DATE;
UPDATE filhotes SET ndatadesmama=datadesmama;
ALTER TABLE filhotes DROP COLUMN datadesmama;
RENAME COLUMN filhotes.ndatadesmama TO datadesmama;